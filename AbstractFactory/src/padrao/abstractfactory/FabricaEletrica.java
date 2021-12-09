package padrao.abstractfactory;

public class FabricaEletrica implements FabricaAbstrata{
    @Override
    public Carro createCarro() {
        return new CarroEletrico();
    }

    @Override
    public Moto createMoto() {
        return new MotoEletrica();
    }
}
