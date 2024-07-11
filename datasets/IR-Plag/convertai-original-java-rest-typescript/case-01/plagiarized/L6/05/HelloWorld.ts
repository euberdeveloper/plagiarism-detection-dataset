package IR;

class HelloWorld {
    static s: string;
    static Cetak(): void {
        for (let a = 5; a > 0; a--) {
            console.log(this.s);
        }
    }
    public static main(args: string[]): void {
        this.s = "Welcome to Java";
        // code to print "Welcome to Java"
        this.Cetak();
        
        //End of code
        // 25779F8829AB7A7650E85A4CC871E6AC Ganteng
    }
}

