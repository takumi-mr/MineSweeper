public class square
{
    private int NumOfMine = 0;
    private int flag = 0;
    public void setMine(){
        this.flag = -1;
    }
    public void setQ(){
        this.flag = 1;
    }
    public void setMark(){
        this.flag = 2;
    }
    public void addNumOfMine(){
        this.NumOfMine += 1;
    }
}
