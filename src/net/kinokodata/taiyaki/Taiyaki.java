package net.kinokodata.taiyaki;

public class Taiyaki {
    private String nakami = "あんこ";

    public Taiyaki(String nakami) {
        this.nakami = nakami;
    }

    public Taiyaki() {
        this.nakami = "あんこ";
    }

    public String getNakami() {
        return this.nakami;
    }
}
