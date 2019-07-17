package josephkandi.github.io.alcphaseone.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import josephkandi.github.io.alcphaseone.R;
import jp.wasabeef.picasso.transformations.CropCircleTransformation;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Picasso.get()
                .load(R.drawable.me)
                .transform(new CropCircleTransformation())
                .into((ImageView)findViewById(R.id.profileImageView));
    }
}
