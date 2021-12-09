package padrao.abstractfactory;

public class Cliente {
    private Carro carro;
    private Moto moto;

    public Cliente (FabricaAbstrata fabricaAbstrata){
        this.carro = fabricaAbstrata.createCarro();
        this.moto = fabricaAbstrata.createMoto();
    }

    public String abastecerCarro() {
        return this.carro.abastecer();
    }

    public String abastecerMoto() {
        return this.moto.abastecer();
    }
}
