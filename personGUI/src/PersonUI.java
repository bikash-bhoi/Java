import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static javax.swing.SwingConstants.RIGHT;

/**
 * Created by Biks on 5/30/2017.
 */
public class PersonUI extends JPanel {

    private JTextField idField = new JTextField(10);
    private JTextField fNameField = new JTextField(30);
    private JTextField mNameField = new JTextField(30);
    private JTextField lNameField = new JTextField(30);
    private JTextField emailField = new JTextField(60);
    private JTextField phoneField = new JTextField(30);

    private JButton createButton = new JButton("New..");
    private JButton updateButton = new JButton("Update");
    private JButton deleteButton = new JButton("Delete");
    private JButton firstButton = new JButton("First");
    private JButton prevButton = new JButton("Previous");
    private JButton nextButton = new JButton("Next");
    private JButton lastButton = new JButton("Last");


    private PersonBean bean = new PersonBean();

    public PersonUI() {
        setBorder(new TitledBorder
                (new EtchedBorder(),"Person Details"));
        setLayout(new BorderLayout(5, 3));
        add(initFields(), BorderLayout.NORTH);
        add(initButtons(), BorderLayout.CENTER);
        setFieldData(bean.moveFirst());
    }

    private JPanel initButtons() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
        panel.add(createButton);
        createButton.addActionListener(new ButtonHandler());
        panel.add(updateButton);
        updateButton.addActionListener(new ButtonHandler());
        panel.add(deleteButton);
        deleteButton.addActionListener(new ButtonHandler());
        panel.add(firstButton);
        firstButton.addActionListener(new ButtonHandler());
        panel.add(prevButton);
        prevButton.addActionListener(new ButtonHandler());
        panel.add(nextButton);
        nextButton.addActionListener(new ButtonHandler());
        panel.add(lastButton);
        lastButton.addActionListener(new ButtonHandler());
        return panel;
    }

    private JPanel initFields() {
        JPanel panel = new JPanel();
        Dimension dim = new Dimension(40,120);
        panel.setPreferredSize(dim);
        panel.setLayout(new GridLayout(6,2));
        panel.add(new JLabel("ID"), "align label");
        panel.add(idField, "wrap");
        idField.setEnabled(false);
        panel.add(new JLabel("First Name"), "align label");
        panel.add(fNameField, "align label");
        //fNameField.setEnabled(false);
        panel.add(new JLabel("Middle Name"), "align label");
        panel.add(mNameField, "align label");
        //mNameField.setEnabled(false);
        panel.add(new JLabel("Last Name"), "align label");
        panel.add(lNameField, "align label");
        //lNameField.setEnabled(false);
        panel.add(new JLabel("email"), "align label");
        panel.add(emailField, "align label");
        //emailField.setEnabled(false);
        panel.add(new JLabel("Phone"), "align label");
        panel.add(phoneField, "align label");
        return panel;
    }

    private Person getFieldData() {
        Person p = new Person();
        p.setPersonId(Integer.parseInt(idField.getText()));
        p.setFirstName(fNameField.getText());
        p.setMiddleName(mNameField.getText());
        p.setLastName(lNameField.getText());
        p.setEmail(emailField.getText());
        p.setPhone(phoneField.getText());
        return p;
    }

    private void setFieldData(Person p) {
        idField.setText(String.valueOf(p.getPersonId()));
        fNameField.setText(p.getFirstName());
        mNameField.setText(p.getMiddleName());
        lNameField.setText(p.getLastName());
        emailField.setText(p.getEmail());
        phoneField.setText(p.getPhone());
    }

    private boolean isEmptyFieldData() {
        return (fNameField.getText().trim().isEmpty()
                && mNameField.getText().trim().isEmpty()
                && lNameField.getText().trim().isEmpty()
                && emailField.getText().trim().isEmpty()
                && phoneField.getText().trim().isEmpty());
    }

    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Person p = getFieldData();
            switch (e.getActionCommand()) {
                case "Save":
                    if (isEmptyFieldData()) {
                        JOptionPane.showMessageDialog(null,
                                "Cannot create an empty record");
                        return;
                    }
                    if (bean.create(p) != null)
                        JOptionPane.showMessageDialog(null,
                                "New person created successfully.");
                    createButton.setText("New..");
                    break;
                case "New..":
                    p.setPersonId(new Random()
                            .nextInt(Integer.MAX_VALUE) + 1);
                    p.setFirstName("");
                    p.setMiddleName("");
                    p.setLastName("");
                    p.setEmail("");
                    p.setPhone("");
                    setFieldData(p);
                    createButton.setText("Save");
                    break;
                case "Update":
                    if (isEmptyFieldData()) {
                        JOptionPane.showMessageDialog(null,
                                "Cannot update an empty record");
                        return;
                    }
                    if (bean.update(p) != null)
                        JOptionPane.showMessageDialog(
                                null,"Person with ID:" + String.valueOf(p.getPersonId()
                                        + " is updated successfully"));
                    break;
                case "Delete":
                    if (isEmptyFieldData()) {
                        JOptionPane.showMessageDialog(null,
                                "Cannot delete an empty record");
                        return;
                    }
                    p = bean.getCurrent();
                    bean.delete();
                    JOptionPane.showMessageDialog(
                            null,"Person with ID:"
                                    + String.valueOf(p.getPersonId()
                                    + " is deleted successfully"));
                    break;
                case "First":
                    setFieldData(bean.moveFirst()); break;
                case "Previous":
                    setFieldData(bean.movePrevious()); break;
                case "Next":
                    setFieldData(bean.moveNext()); break;
                case "Last":
                    setFieldData(bean.moveLast()); break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "invalid command");
            }
        }
    }
}