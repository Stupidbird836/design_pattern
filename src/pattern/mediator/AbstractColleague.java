package pattern.mediator;

/**
 * @className AbstractColleague
 * @description
 * @author huchenfei
 * @date 2019/3/6 17:57
 * @version 1.0
 **/
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
