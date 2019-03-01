public class Square
{
    //周りのマスの地雷数、地雷の場合は-1　
    private int NumOfMine = 0;
    //マークフラグ　1は? 2は地雷候補
    private int flag = 0;
    //空いているかどうかのフラグ
    private boolean openflag = false;
    //マスを開ける際に確認したかどうかのフラグ
    public boolean Checked = false;

    public void setMine(){
        this.NumOfMine = -1;
    }
    public void setQ(){ this.flag = 1; }
    public void setMark(){ this.flag = 2; }
    public void setChecked(){ this.Checked = true; }
    public void Open(){ this.openflag = true; }
    public void addNumOfMine(){
        if(this.NumOfMine != -1){
            this.NumOfMine++;
        }
    }
    public int getNumOfMine(){ return NumOfMine; }
    public boolean isMine(){ return (this.NumOfMine == -1); }
    public boolean isOpened(){ return this.openflag; }
    public boolean isCorrect(){ return (this.flag == 2 && this.isMine()); }
    public boolean isZero(){ return (this.NumOfMine == 0); }
}
