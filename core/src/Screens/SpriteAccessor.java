package Screens;

import com.badlogic.gdx.graphics.g2d.Sprite;

import aurelienribon.tweenengine.TweenAccessor;

public class SpriteAccessor implements TweenAccessor<Sprite>
{
	public static final int  ALPHA = 0;
	@Override
	public int getValues(Sprite target, int tweenType, float[] returnValues) {
		// TODO Auto-generated method stub
		switch(tweenType)
		{
			case ALPHA:
				returnValues[0] = target.getColor().a;
				return 1;
			default:
				assert false;
				return -1;
		}
	}

	@Override
	public void setValues(Sprite target, int tweenType, float[] newValues) {
		// TODO Auto-generated method stub
		switch(tweenType)
		{
			case ALPHA:
				target.setColor(target.getColor().r, target.getColor().g, target.getColor().b, newValues[0]);
				break;
			default:
				assert false;
		}
	}
	
}
