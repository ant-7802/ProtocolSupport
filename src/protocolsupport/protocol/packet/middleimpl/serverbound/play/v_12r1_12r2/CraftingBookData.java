package protocolsupport.protocol.packet.middleimpl.serverbound.play.v_12r1_12r2;

import io.netty.buffer.ByteBuf;
import protocolsupport.protocol.packet.middle.serverbound.play.MiddleCraftingBookData;
import protocolsupport.protocol.serializer.MiscSerializer;

public class CraftingBookData extends MiddleCraftingBookData {

	@Override
	public void readFromClientData(ByteBuf clientdata) {
		type = MiscSerializer.readVarIntEnum(clientdata, Type.CONSTANT_LOOKUP);
		switch (type) {
			case DISPLAYED_RECIPE: {
				recipeId = clientdata.readInt();
				break;
			}
			case CRAFTING_BOOK_STATUS: {
				craftingBookOpen = clientdata.readBoolean();
				recipeFilterEnabled = clientdata.readBoolean();
				break;
			}
		}
	}

}
