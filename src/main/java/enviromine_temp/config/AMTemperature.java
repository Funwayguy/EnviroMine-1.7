package enviromine_temp.config;

import enviromine.core.api.config.Attribute;
import enviromine.core.api.config.AttributeManager;
import enviromine.core.api.config.ConfigKey;
import enviromine.core.api.config.def.ConfigKeyBlock;
import enviromine.core.api.config.def.ConfigKeyEntity;
import enviromine.core.api.config.def.ConfigKeyItem;

public class AMTemperature extends AttributeManager
{
	public static final AMTemperature instance = new AMTemperature();
	
	@Override
	public String getConfigID()
	{
		return "Temperature";
	}

	@Override
	public Attribute createAttribute(ConfigKey config)
	{
		if(config instanceof ConfigKeyBlock)
		{
			return createBlockAttribute((ConfigKeyBlock)config);
		} else if(config instanceof ConfigKeyEntity)
		{
			return createEntityAttribute((ConfigKeyEntity)config);
		} else if(config instanceof ConfigKeyItem)
		{
			return createItemAttribute((ConfigKeyItem)config);
		} else
		{
			return null;
		}
	}
	
	protected AttributeTemperature createBlockAttribute(ConfigKeyBlock config)
	{
		return new AttributeTemperature(config);
	}
	
	protected AttributeTemperature createEntityAttribute(ConfigKeyEntity config)
	{
		return null;
	}
	
	protected AttributeTemperature createItemAttribute(ConfigKeyItem config)
	{
		return null;
	}

	@Override
	public void LoadDefaults()
	{
	}
}
