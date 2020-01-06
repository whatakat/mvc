package com.company;

public interface BeatModelInterface {
    void initialize();
    void on();
    void off();
    void setBPM();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
