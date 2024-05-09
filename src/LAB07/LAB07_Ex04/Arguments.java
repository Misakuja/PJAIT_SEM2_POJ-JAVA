package LAB07.LAB07_Ex04;

class Arguments {
    int arg1;
    int arg2;
    int arg3;
    int arg4;
    int arg5;

    Arguments(int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.arg4 = arg4;
        this.arg5 = arg5;
    }
    public String toString(){
        return arg1 + " " + arg2 + " " + arg3 + " " + arg4 + " " + arg5 + " ";
    }
}
