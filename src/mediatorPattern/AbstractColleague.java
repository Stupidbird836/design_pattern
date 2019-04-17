package mediatorPattern;

/**
 * @ClassName AbstractColleague
 * @Description
 * @Author huchenfei
 * @Date 2019/3/6 17:57
 * @Version 1.0
 **/
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
