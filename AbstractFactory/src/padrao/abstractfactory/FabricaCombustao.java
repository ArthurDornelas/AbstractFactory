package padrao.abstractfactory;

public class FabricaCombustao implements FabricaAbstrata {
    @Override
    public Carro createCarro() {
        return new CarroCombustao();
    }

    @Override
    public Moto createMoto() {
        return new MotoCombustao();
    }
}
