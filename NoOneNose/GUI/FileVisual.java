package NoOneNose.GUI;

import java.io.File;
import javax.swing.*;
import java.awt.*;

public class FileVisual extends JPanel
{
	private JLabel fileIcon = new JLabel();
	private JLabel fileName = new JLabel();
	
	public FileVisual(File f)
	{
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
	
		fileIcon.setIcon(UIManager.getIcon("OptionPane.informationIcon"));
		fileIcon.setHorizontalAlignment(JLabel.CENTER);
		fileName.setText(f.getName());
		fileName.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(fileIcon, BorderLayout.CENTER);
		this.add(fileName, BorderLayout.SOUTH);
	}
}