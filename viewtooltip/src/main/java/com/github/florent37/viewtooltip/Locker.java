package com.github.florent37.viewtooltip;

public class Locker {

    private boolean isLocked;

    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock(){
        isLocked = false;
    }
}
