package com.mind.mind_calc.Sounds;

import android.content.Context;
import android.media.MediaPlayer;

import com.mind.mind_calc.R;

public class SoundEffect {

    public void tone(Context context)
    {
        final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.bell_hop_bell);
        mediaPlayer.start();
    }

    public void tone(Context context, String type)
    {
        final MediaPlayer mediaPlayer;

        if (type.equals("correct")) {
            mediaPlayer = MediaPlayer.create(context, R.raw.victory);
        } else {
            mediaPlayer = MediaPlayer.create(context, R.raw.fail_buzzer);
        }

        mediaPlayer.start();
    }

    public void toneBeep(Context context)
    {
        final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.beep);
        mediaPlayer.start();
    }

    public void tap(Context context)
    {
        final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.tap);
        mediaPlayer.start();
    }
}
