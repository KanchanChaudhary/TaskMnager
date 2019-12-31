//package com.kanchan.taskmnager;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityCompat;
//import androidx.core.content.ContextCompat;
//import androidx.loader.content.CursorLoader;
//
//import android.Manifest;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.database.Cursor;
//import android.net.Uri;
//import android.os.Bundle;
//import android.provider.MediaStore;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.Toast;
//
//public class SignUp extends AppCompatActivity {
//    private ImageView btntakeapicture;
//     private EditText firstname, lastname, username, password ,confirmpassword;
//  private Button signup;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sign_up);
//
//        firstname=findViewById(R.id.etfirstname);
//        lastname=findViewById(R.id.etlastname);
//        username=findViewById(R.id.etusername);
//        password=findViewById(R.id.etpassword);
//        confirmpassword=findViewById(R.id.etconfirmpassword);
//        btntakeapicture=findViewById(R.id.imgview);
//
//        signup=findViewById(R.id.btnsignup);
//
//
//
//        private void checkPermission(){
//            if (ContextCompat.checkSelfPermission( this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(this ,new String[]
//                        {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);
//            }
//
//        }
//        private void loadCamera()
//        {
//            Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//            if (intent.resolveActivity(getPackageManager()) !=null){
//                startActivityForResult(intent, 0);
//            }
//        }
//
//        private void BrowseImage(){
//            Intent intent=new Intent(Intent.ACTION_PICK);
//            intent.setType("image/");
//            startActivityForResult(intent, 0);
//        }
//
//        @Override
//        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//            super.onActivityResult(requestCode, resultCode, data);
//
//
//            if ( resultCode==RESULT_OK) {
//                if (data==null){
//                    Toast.makeText(this,"please select an image",Toast.LENGTH_SHORT).show();
//                }
//            }
//            Uri uri=data.getData();
//
//        }
//
//        private  String getRealPathFromUri(Uri uri){
//
//            String[] projection={MediaStore.Images.Media.DATA};
//            CursorLoader loader=new CursorLoader(getApplicationContext(), uri, projection, null, null,null);
//            Cursor cursor=loader.loadInBackground();
//            int colIndex=cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
//            cursor.moveToFirst();
//            String result=cursor.getString(colIndex);
//            cursor.close();
//            return result;
//        }
//
//
//
//
//
//
//
//
//
//
//
//    }
//}
