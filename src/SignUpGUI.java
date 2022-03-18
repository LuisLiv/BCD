import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

import java.util.Calendar;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class SignUpGUI {

	protected Shell shell;
	private Text txtName;
	private Text txtEmail;
	private Text txtIC;
	private Text txtPassword;
	private Text txtPhoneNumber;


	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SignUpGUI window = new SignUpGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(628, 440);
		shell.setText("SWT Application");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.BOLD));
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBounds(170, 10, 92, 28);
		lblNewLabel.setText("SIGN UP");
		
		Label lblName = new Label(shell, SWT.NONE);
		lblName.setBounds(32, 58, 55, 15);
		lblName.setText("Name");
		
		Label lblDat = new Label(shell, SWT.NONE);
		lblDat.setBounds(32, 237, 78, 15);
		lblDat.setText("Date Of Birth");
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setBounds(32, 293, 55, 15);
		lblPassword.setText("Password");
		
		Label lblIc = new Label(shell, SWT.NONE);
		lblIc.setBounds(234, 109, 55, 15);
		lblIc.setText("IC");
		
		txtName = new Text(shell, SWT.BORDER);
		txtName.setBounds(32, 79, 381, 21);
		
		txtEmail = new Text(shell, SWT.BORDER);
		txtEmail.setBounds(32, 127, 179, 21);
		
		DateTime dtpBirthDate = new DateTime(shell, SWT.BORDER);
		dtpBirthDate.setBounds(32, 258, 179, 29);
		
		txtIC = new Text(shell, SWT.BORDER);
		txtIC.setBounds(234, 127, 179, 21);
		
		Label lblGender = new Label(shell, SWT.NONE);
		lblGender.setText("Gender");
		lblGender.setBounds(32, 163, 55, 15);
		
		Button btnMale = new Button(shell, SWT.RADIO);
		btnMale.setBounds(32, 184, 90, 16);
		btnMale.setText("Male");
		
		Button btnFemale = new Button(shell, SWT.RADIO);
		btnFemale.setText("Female");
		btnFemale.setBounds(32, 210, 90, 16);
		
		Label lblCategory = new Label(shell, SWT.NONE);
		lblCategory.setBounds(234, 163, 55, 15);
		lblCategory.setText("Category");
		
		Button btnOwner = new Button(shell, SWT.RADIO);
		btnOwner.setBounds(234, 184, 90, 16);
		btnOwner.setText("Owner");
		
		Button btnCarRenter = new Button(shell, SWT.RADIO);
		btnCarRenter.setBounds(234, 210, 90, 16);
		btnCarRenter.setText("Car Renter");
		
		txtPassword = new Text(shell, SWT.BORDER);
		txtPassword.setBounds(32, 314, 379, 21);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Account account = new Account();
				account.setFullName(txtName.getText());	
				account.setEmail(txtEmail.getText());
				account.setPassword(txtPassword.getText());
				account.setGender(btnMale.getText());
				
				Calendar cal = Calendar.getInstance();
				cal.clear();
				
				cal.set(Calendar.YEAR, dtpBirthDate.getYear());
				cal.set(Calendar.MONTH, dtpBirthDate.getMonth());
				cal.set(Calendar.DAY_OF_MONTH, dtpBirthDate.getDay());
				
				cal.set(Calendar.HOUR_OF_DAY, dtpBirthDate.getHours());
				cal.set(Calendar.MINUTE, dtpBirthDate.getMinutes());
				cal.set(Calendar.SECOND, dtpBirthDate.getSeconds());
				
				Date date = cal.getTime();
				account.setBirthDate(date);
				account.setICNo(Integer.parseInt(txtIC.getText()));
				account.setPhone(txtPhoneNumber.getText());
				
				System.out.println(account.toString());
			
			}
		});
		
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnNewButton.setBounds(163, 357, 115, 28);
		btnNewButton.setText("Sign Up");
		
		Label lblEmail = new Label(shell, SWT.NONE);
		lblEmail.setBounds(32, 109, 55, 15);
		lblEmail.setText("Email");
		
		Label lblPhone = new Label(shell, SWT.NONE);
		lblPhone.setText("Phone Number");
		lblPhone.setBounds(234, 237, 90, 15);
		
		txtPhoneNumber = new Text(shell, SWT.BORDER);
		txtPhoneNumber.setBounds(234, 256, 179, 21);

	}
}
