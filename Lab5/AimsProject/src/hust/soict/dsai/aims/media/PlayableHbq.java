package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerExceptionHbq;

public interface PlayableHbq {
    // Phương thức trừu tượng, không có thân phương thức
    public void play() throws PlayerExceptionHbq;
}

