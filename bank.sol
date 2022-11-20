pragma solidity^0.6.0;
contract Bank {

   uint public balance;
  
   function deposite(uint amount) external payable {
     balance += amount;
   }
   function withdraw(uint amount) external {     
     require(balance >= amount, "Insufficient balance!");
     balance -= amount;
   }
}
