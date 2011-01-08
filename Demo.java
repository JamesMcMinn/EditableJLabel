import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Demo extends JFrame {

	public Demo() {
		super("EditableJLabel Example");
		Container content = getContentPane();
		
		// Create the EditableJLabel
		EditableJLabel title = new EditableJLabel("Meow");
		
		title.setPreferredSize(new Dimension(150,24));

        // Create and dd a listener for chnages in the value of EditableJLabel
		ValueChangedListener valueListener = new ValueChangedListener() {
			@Override
			public void valueChanged(String value, JComponent source) {
				Demo.this.setTitle(value);
			}
		};
		title.addValueChangedListener(valueListener);
		
		// Add the EditableJLabel to the content pane
		content.add(title);
		
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Demo();
	}
}
