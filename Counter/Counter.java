class Counter {
    private int clicksCount = 0;

    public int getClicks(){
        return this.clicksCount ;
    }

    public void click(){
        this.clicksCount += 1 ;
    }

    public void reset(){
        this.clicksCount = 0 ;
    }
}
