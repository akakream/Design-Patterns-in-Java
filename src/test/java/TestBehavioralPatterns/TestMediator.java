package TestBehavioralPatterns;

import BehavioralPatterns.Mediator.MemberApplication;
import BehavioralPatterns.Mediator.Position;
import BehavioralPatterns.Mediator.ThirtySixBoysBoard;
import BehavioralPatterns.Mediator.ThirtySixBoysMediator;
import org.junit.jupiter.api.Test;

public class TestMediator {
    @Test
    public void testMain() {
        ThirtySixBoysBoard board36 = new ThirtySixBoysBoard();
        ThirtySixBoysMediator mediator = new ThirtySixBoysMediator(board36);
        MemberApplication killaAppl = new MemberApplication("kill hakan", Position.Hitman, Position.BoardMember, mediator);
        MemberApplication meroAppl = new MemberApplication("mero", Position.Member, Position.NoMember, mediator);
        MemberApplication haftbefehlAppl = new MemberApplication("haftbefehl", Position.BoardMember, Position.Member, mediator);

        mediator.apply(killaAppl);
        mediator.apply(meroAppl);
        mediator.apply(haftbefehlAppl);
    }
}
