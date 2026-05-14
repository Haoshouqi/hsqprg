import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends JFrame {
    private JLabel timeLabel;
    private SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    public Clock() {
        setTitle("桌面时钟");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 居中显示
        setAlwaysOnTop(true); // 始终在最前面

        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 48));
        add(timeLabel);

        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();

        updateTime(); // 初始化显示
        setVisible(true);
    }

    private void updateTime() {
        String time = timeFormat.format(new Date());
        timeLabel.setText(time);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Clock());
    }
}