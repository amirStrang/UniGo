package com.eaglet.unigo.Registering;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.eaglet.unigo.R;
import com.eaglet.unigo.Login.Grade;

public class Register21 extends AppCompatActivity {
    private CircleImageView profileImage,addImage;
    private RadioButton teacherRB,studentRB;
    ImageView a;
    int isteacher=2;
    private Spinner citySpinner,areaSpinner,schoolSpinner;
    private RelativeLayout register;
    private Bitmap yourSelectedImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register21);

        initiate();

        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GalleryPick();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(isteacher==1){

                    //it should go to register2.2 activity but this activity is not available!!
                    Intent intent=new Intent(Register21.this, Register23.class);
                    startActivity(intent);
                    finish();
                }else if(isteacher==0){
                    Intent intent=new Intent(Register21.this, Grade.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(Register21.this, "لطفا اطلاعات خواسته شده در فرم مخصوص به خود را پرکنید!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    void initiate(){
        profileImage=findViewById(R.id.show_profileImage);
        addImage=findViewById(R.id.add_Image);
        teacherRB=findViewById(R.id.teacherRB);
        studentRB=findViewById(R.id.studentRB);
        register=findViewById(R.id.registerbtn);
    }
    public void RBclicked(View view) {

        Fragment fragment;
        if (view.getId() == R.id.teacherRB) {
            studentRB.setChecked(false);
            fragment = new TeacherFormFragment();

            //user is a teacher
            isteacher=1;
        } else {
            teacherRB.setChecked(false);
            fragment = new StudentFormFragment();

            //user is a student
            isteacher=0;
        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.formFragment, fragment);
        transaction.commit();
    }
    void GalleryPick(){

        final int ID_THIS_ACTIVITY=12;
        Intent i = new Intent(Intent.ACTION_PICK,
                MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        i.setType("image/*");
        final int ACTIVITY_SELECT_IMAGE = 1222;
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
                    String[] permission = {Manifest.permission.READ_EXTERNAL_STORAGE};
                    requestPermissions(permission, ID_THIS_ACTIVITY);
                } else {

                    startActivityForResult(i, ACTIVITY_SELECT_IMAGE);
                }
            }
        }catch (Exception e){
            Toast.makeText(Register21.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case 1234:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = data.getData();
                    String[] filePathColumn = {MediaStore.Images.Media.DATA};

                    Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
                    cursor.moveToFirst();

                    int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
                    String filePath = cursor.getString(columnIndex);

                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;

                    cursor.close();
                    yourSelectedImage = BitmapFactory.decodeFile(filePath,options);
                    profileImage.setImageDrawable(null);
                    profileImage.setImageBitmap(yourSelectedImage);
                    }



                }
        }


}
