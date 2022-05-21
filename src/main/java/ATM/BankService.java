package ATM;

public interface BankService {
    public Boolean isValidUser(CardInfo cardInfo,String pin);
    public void validateCardDetails(CardInfo cardInfo);
    public TransactionDetail executeTransactionDetails(Transaction transaction,Customer customer);
}
