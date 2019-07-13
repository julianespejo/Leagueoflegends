package videoatrox;

import mx.edu.itpLOL.R;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoEspada extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.videoatrox);
		
		String LINK = "http://cdn.leagueoflegends.com/champion-abilities/videos/mp4/0266_04.mp4";
	    VideoView videoView = (VideoView) findViewById(R.id.videoatrox);
	    MediaController mc = new MediaController(this);
	    mc.setAnchorView(videoView);
	    mc.setMediaPlayer(videoView);
	    Uri video = Uri.parse(LINK);
	    videoView.setMediaController(mc);
	    videoView.setVideoURI(video);
	    videoView.start();
	}

}
