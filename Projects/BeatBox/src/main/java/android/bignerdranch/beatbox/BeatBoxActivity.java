package android.bignerdranch.beatbox;

import android.bignerdranch.beatbox.BeatBoxFragment;
import android.bignerdranch.beatbox.SingleFragmentActivity;

public class BeatBoxActivity extends SingleFragmentActivity{
    @Override
    protected BeatBoxFragment createFragment(){
        return BeatBoxFragment.newInstance();
    }
}
