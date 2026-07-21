import javax.swing.*;
import java.awt.*;

public class BankGUI {
    //Initialize everything
    private JFrame frame;
    //Initialize welcome screen
        private JPanel newAccountScreen;
        private JPanel headerPanel;

        private JPanel centerPanel;
        private JLabel welcome;

        private BankAccount account;
        public BankGUI() {
            this.account = account;
            initialize();
        }

    public void initialize() {
    //Window Frame
        frame = new JFrame();
        frame.setLayout(new BorderLayout(10,5));
        frame.setTitle("BankAccount");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
    //New Account Screen

    //Creating the main header page for app
                headerPanel = new JPanel();
                headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

                headerPanel.setBackground(Color.DARK_GRAY);

                JButton balanceBut = new JButton("Check Balance");
                headerPanel.add(balanceBut);

                JButton depositBut = new JButton("Deposit");
                headerPanel.add(depositBut);

                JButton withdrawBut = new JButton("Withdraw");
                headerPanel.add(withdrawBut);

                JButton prevTransBut = new JButton("Previous Transaction");
                headerPanel.add(prevTransBut);

                JButton exitBut = new JButton("Exit");
                headerPanel.add(exitBut);
                frame.add(headerPanel, BorderLayout.NORTH);
    //Center Panel for customer info and welcome message
                centerPanel = new JPanel();
                centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
                centerPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
                frame.add(centerPanel,BorderLayout.CENTER);
    //creating frame itself
                welcome = new JLabel("Welcome, [NAME]" ); //Need to ask user for name and name should appear later
                centerPanel.add(welcome);
                welcome.setForeground(Color.BLUE);
                welcome.setFont(new Font("Sans-serif", Font.BOLD,36));


        //Allow frame to exist
        frame.setVisible(true);
        }
    }