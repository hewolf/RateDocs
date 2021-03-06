package com.az.ratedocs.onclick;

/* Onclick actions in the DoctorProfileActivity class.
 * */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.az.ratedocs.CommentActivity;
import com.az.ratedocs.R;
import com.az.ratedocs.display.DisplayFactory;
import com.az.ratedocs.display.DisplayHelper;
import com.az.ratedocs.utilities.CallDoctor;
import com.az.ratedocs.utilities.EmailDoctor;

public class OnClickDoctorProfile implements OnClickInterface {
	private Activity activity;
	private Context context;
	private Button comment;
	private String id;
	private String username;

	/* Associate the on click methods with our buttons */
	public OnClickDoctorProfile(final Activity activity, final Context context) {
		this.activity = activity;
		this.context = context;

		String value = "";
		String name = "";
		Bundle extras = activity.getIntent().getExtras();

		if (extras != null) {
			value = extras.getString("id");
			name = extras.getString("username");
		}
		
		DisplayHelper bd = DisplayFactory.getDisplayHelper(activity, value, context);
		CallDoctor call = new CallDoctor(activity, value);
		EmailDoctor email = new EmailDoctor(activity, value);
		
		id = value;
		username = name;
		
		comment = (Button) activity.findViewById(R.id.comment);
		comment.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent i1 = new Intent(context, CommentActivity.class);
				i1.putExtra("id", id);
				i1.putExtra("username", username);
				activity.startActivity(i1);
			}
		});
	}
}
