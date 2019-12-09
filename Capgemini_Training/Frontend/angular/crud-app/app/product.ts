export class Product {
constructor(
    public pname: string,
    public category: string,
    public price: number,
    public details: string,
    public imgURL: string,
    public pk ?: string
) { }
}
