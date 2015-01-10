package com.maienm.urmi

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.media.MediaControlIntent

class MediaActivity extends Activity {
    override def onCreate(savedInstanceState: Bundle): Unit = {
        super.onCreate(savedInstanceState)

        // Delegate the intents.
        val intent: Intent = getIntent
        val action: String = intent.getAction
        action match {
            case MediaControlIntent.ACTION_GET_STATUS => onIntentActionGetStatus(intent)
            case MediaControlIntent.ACTION_PAUSE => onIntentActionPause(intent)
            case MediaControlIntent.ACTION_PLAY => onIntentActionPlay(intent)
            case MediaControlIntent.ACTION_RESUME => onIntentActionResume(intent)
            case MediaControlIntent.ACTION_SEEK => onIntentActionSeek(intent)
            case _ => Unit
        }
    }

    /**
     * Get the current playback status.
     */
    def onIntentActionGetStatus(intent: Intent): Unit = {

    }

    /**
     * Pause the playback.
     */
    def onIntentActionPause(intent: Intent): Unit = ???

    /**
     * Start playing the next item in the playlist.
     */
    def onIntentActionPlay(intent: Intent): Unit = ???

    /**
     * Continue playing the current item.
     */
    def onIntentActionResume(intent: Intent): Unit = ???

    /**
     * Change the playback position.
     */
    def onIntentActionSeek(intent: Intent): Unit = ???
}
