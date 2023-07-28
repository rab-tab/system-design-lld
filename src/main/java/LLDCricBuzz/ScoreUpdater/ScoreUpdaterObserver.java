package LLDCricBuzz.ScoreUpdater;

import LLDCricBuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
