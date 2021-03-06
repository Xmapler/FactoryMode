import com.xhf.design.iter.Police;
import com.xhf.design.iter.Security;
import com.xhf.design.iter.Thief;
import com.xhf.design.iter.Transporter;

/**
 * 例子中没有关于数据和状态的变化通知，只是简单通知到各个观察者，告诉他们被观察者有行动。
 观察者模式在关于目标角色、观察者角色通信的具体实现中，有两个版本。
 一种情况便是目标角色在发生变化后，仅仅告诉观察者角色“我变化了”，观察者角色如果想要知道具体的变化细节，则就要自己从目标角色的接口中得到。这种模式被很形象的称为：拉模式——就是说变化的信息是观察者角色主动从目标角色中“拉”出来的。
 还有一种方法，那就是我目标角色“服务一条龙”，通知你发生变化的同时，通过一个参数将变化的细节传递到观察者角色中去。这就是“推模式”——管你要不要，先给你啦。
 这两种模式的使用，取决于系统设计时的需要。如果目标角色比较复杂，并且观察者角色进行更新时必须得到一些具体变化的信息，则“推模式”比较合适。如果目标角色比较简单，则“拉模式”就很合适
 */

/**
 * 测试类
 * Created by asus on 2016/11/9.
 */
public class test {
    public static void main(String[] args) {

        Transporter transporter = new Transporter();

        Police police = new Police();
        Security security = new Security();
        Thief thief = new Thief();

        transporter.addWatcher(police);
        transporter.addWatcher(security);
        transporter.addWatcher(security);

        transporter.notifyWatchers();
    }
}