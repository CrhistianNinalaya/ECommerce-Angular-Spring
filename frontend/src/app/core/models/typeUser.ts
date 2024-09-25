export class typeUser{
    private codTypeUser: number;   
    private description: string;

    constructor(codeTypeUser: number, description: string){
        this.codTypeUser = codeTypeUser;
        this.description = description;
    }

    public getCodTypeUser(): number {
        return this.codTypeUser;
    }

    public setCodTypeUser(codTypeUser: number): void {
        this.codTypeUser = codTypeUser;
    }

    public getDescription(): string {
        return this.description;
    }

    public setDescription(description: string): void {
        this.description = description;
    }
}