public class Square
{
    private int NumOfMine = 0;
    private int flag = 0;
    private boolean openflag = false;
    public void setMine(){

        this.NumOfMine = -1;
    }
    public void setQ(){
        this.flag = 1;
    }
    public void setMark(){
        this.flag = 2;
    }
    public void addNumOfMine(){
        if(this.NumOfMine != -1){
            this.NumOfMine += 1;
        }
    }
    public boolean isMine(){
        if(this.NumOfMine == -1){
            return true;
        }
        return false;
    }
    public boolean isOpend(){
        if(this.openflag){
            return true;
        }
        return false;
    }
    public int getNumOfMine(){
        return NumOfMine;
    }
}
