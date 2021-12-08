package com.mind.mind_calc.Sounds;

import android.content.Context;
import android.media.MediaPlayer;

import com.mind.mind_calc.R;

public class Winner extends SoundEffect {

    @Override
    public void tone(Context context)
    {
        final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.win_horn);
        mediaPlayer.start();
    }

}
