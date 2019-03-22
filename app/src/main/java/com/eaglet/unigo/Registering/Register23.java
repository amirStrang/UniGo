package com.eaglet.unigo.Registering;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import com.eaglet.unigo.R;
import com.eaglet.unigo.MainActivity;

public class Register23 extends AppCompatActivity {

    int d=0;
    RelativeLayout nextBtn;
    private Spinner spinner,sh_spinner;
    TextView teacherName;
    EditText father,shenasnameNum,codeMelli,shenasname_serie,address,postCode,officeNum,officeAddress,post,accountNum,cardNum,ownerCardNum,shebaNum,branchCode;
    RadioButton semiProfessional,professional;
    Bitmap yourSelectedImage;
    ImageView shenasnameImg,melliCardImg,qabzImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register23);

        initiate();
        SpinnerCreator();


        shenasnameImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d=1;
                GalleryPick();
                shenasnameImg.setPadding(8,8,8,8);
            }
        });
        melliCardImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d=2;
                GalleryPick();
                melliCardImg.setPadding(8,8,8,8);
            }
        });

        qabzImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d=3;
                GalleryPick();
                qabzImg.setPadding(8,8,8,8);
            }
        });

        semiProfessional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                professional.setChecked(false);
            }
        });
        professional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                semiProfessional.setChecked(false);
            }
        });


         nextBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 int width= Resources.getSystem().getDisplayMetrics().widthPixels;
                 int height= Resources.getSystem().getDisplayMetrics().heightPixels;
                 final int myW=(width*3)/4;
                 final int myH=(height*4)/7;

                 AlertDialog.Builder sbuilder=new AlertDialog.Builder(Register23.this);
                 View sView=getLayoutInflater().inflate(R.layout.information_sent,null);

                 RelativeLayout send=sView.findViewById(R.id.send);
                 send.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         Toast.makeText(Register23.this, "sent !", Toast.LENGTH_SHORT).show();
                         Intent intent=new Intent(Register23.this, MainActivity.class);
                         startActivity(intent);
                         finish();
                     }
                 });
                 sView.setMinimumWidth(myW);
                 sView.setMinimumHeight(myH);
                 sbuilder.setView(sView);
                 Dialog alertDialog = sbuilder.create();
                 alertDialog.show();
                 alertDialog.getWindow().setLayout(myW,myH);
             }
         });

    }

    private void SpinnerCreator(){
        spinner = (Spinner) findViewById(R.id.cityList);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.cities, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);


        sh_spinner = (Spinner) findViewById(R.id.shCityList);

        ArrayAdapter<CharSequence> sh_adapter = ArrayAdapter.createFromResource(this,
                R.array.sh_cities, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sh_spinner.setAdapter(sh_adapter);
    }
    void initiate(){

        teacherName=(TextView)findViewById(R.id.teacher_name);
        father=findViewById(R.id.father);
        shenasnameNum=findViewById(R.id.shNum);
        codeMelli=findViewById(R.id.codemelli);
        shenasname_serie=findViewById(R.id.shSerie);
        address=findViewById(R.id.Address);
        postCode=findViewById(R.id.postcode);
        officeNum=findViewById(R.id.officeNum);
        officeAddress=findViewById(R.id.officeAddress);
        post=findViewById(R.id.post);
        accountNum=findViewById(R.id.accountNum);
        cardNum=findViewById(R.id.cardNum);
        ownerCardNum=findViewById(R.id.sCardNum);
        shebaNum=findViewById(R.id.shebaNum);
        branchCode=findViewById(R.id.brancCode);
        semiProfessional=findViewById(R.id.semiProRB);
        professional=findViewById(R.id.ProfessinalRB);

        shenasnameImg=findViewById(R.id.ShenasnameImg);
        melliCardImg=findViewById(R.id.melliCardImg);
        qabzImg=findViewById(R.id.qabz);

        nextBtn=findViewById(R.id.next);

    }
    void GalleryPick(){

        final int ID_THIS_ACTIVITY=10;
        Intent i = new Intent(Intent.ACTION_PICK,
                MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        i.setType("image/*");
        final int ACTIVITY_SELECT_IMAGE = 1234;
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
            Toast.makeText(Register23.this, e.getMessage(), Toast.LENGTH_SHORT).show();
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

                    switch (d){
                        case 1:
                            shenasnameImg.setImageBitmap(yourSelectedImage);
                            break;
                        case 2:
                            melliCardImg.setImageBitmap(yourSelectedImage);
                            break;
                        case 3:
                            qabzImg.setImageBitmap(yourSelectedImage);
                            break;

                    }



                }
        }
    }

}
