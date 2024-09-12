
public class BaralhoTradicionalFactory extends BaralhoFactory {
	@Override
	public BaralhoInterface createBaralho() {
		return new BaralhoTradicional();
	}
}
