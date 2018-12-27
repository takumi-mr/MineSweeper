public class Square
{
    private int NumOfMine = 0;
    private int flag = 0;
    private boolean openflag = false;
    public boolean Checked = false;
    public void setMine(){
        this.NumOfMine = -1;
    }
    public void Open(){
        this.openflag = true;
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
        return (this.NumOfMine == -1);
    }
    public boolean isOpened(){
        return this.openflag;
    }
    public int getNumOfMine(){
        return NumOfMine;
    }
    public boolean isCorrect(){
        if(this.flag == 2 && this.isMine()){
            return true;
        }
        return false;
    }
    public void setChecked(){
        this.Checked = true;
    }
    public boolean isZero(){
        if(this.NumOfMine == 0){
            return true;
        }
        return  false;
    }
}
