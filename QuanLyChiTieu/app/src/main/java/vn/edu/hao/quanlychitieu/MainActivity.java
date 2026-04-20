package vn.edu.hao.quanlychitieu;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv = new TextView(this);
        tv.setText("FIREBASE TEST");
        setContentView(tv);

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference myRef = database.getReference("test");

        // WRITE DATA
        myRef.setValue("app ok")
                .addOnSuccessListener(unused ->
                        Log.d("FIREBASE", "WRITE SUCCESS")
                )
                .addOnFailureListener(e ->
                        Log.e("FIREBASE", "WRITE ERROR", e)
                );

        // READ + LISTEN REALTIME
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);

                tv.setText("Value: " + value);

                Toast.makeText(MainActivity.this,
                        "Value is: " + value,
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.e("FIREBASE", "READ ERROR", error.toException());
            }
        });
    }
}