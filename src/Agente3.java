import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;


public class Agente3 extends Agent 
{
	private static final long serialVerisonUID = 1L;
	protected CyclicBehaviour cyclicBehaviour;
		public void setup()
		{
			cyclicBehaviour = new CyclicBehaviour(this)
			{

				@Override
				public void action() 
				{
					block();
				}
				
			};
			addBehaviour(cyclicBehaviour);
		}
}
