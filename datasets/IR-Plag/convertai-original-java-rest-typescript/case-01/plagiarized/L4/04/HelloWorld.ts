package IR;

class HelloWorld {
    static s: string;
    static Cetak(): void {
        console.log(this.s);
        console.log(this.s);
        console.log(this.s);
        console.log(this.s);
        console.log(this.s);
    }
    public static main(args: string[]): void {
        this.s = "Welcome to Java";
        this.Cetak();
        // 25779F8829AB7A7650E85A4CC871E6AC Ganteng
    }
}

