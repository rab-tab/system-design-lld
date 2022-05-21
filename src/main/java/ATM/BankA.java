package ATM;

public class BankA implements BankService{
    @Override
    public Boolean isValidUser(CardInfo cardInfo, String pin) {
        return null;
    }

    @Override
    public void validateCardDetails(CardInfo cardInfo) {

    }

    @Override
    public TransactionDetail executeTransactionDetails(Transaction transaction, Customer customer) {
        return null;
    }
}
