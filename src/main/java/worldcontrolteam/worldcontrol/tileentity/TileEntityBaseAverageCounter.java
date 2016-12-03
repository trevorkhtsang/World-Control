package worldcontrolteam.worldcontrol.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraftforge.items.IItemHandler;
import worldcontrolteam.worldcontrol.inventory.ISlotItemFilter;

public abstract class TileEntityBaseAverageCounter extends TileEntity implements IItemHandler, ITickable, ISlotItemFilter {

	ItemStack stack;
	public short period;

	public TileEntityBaseAverageCounter() {
		this.period = 1;
	}

	@Override
	public int getSlots(){
		return 1;
	}

	@Override
	public ItemStack getStackInSlot(int slot){
		return stack;
	}

	@Override
	public ItemStack insertItem(int slot, ItemStack stackl, boolean simulate){
		if(stackl != null)
			if(this.stack.stackSize < 5){
				//TODO: Finish this code...
			}
		return null;
	}

	@Override
	public ItemStack extractItem(int slot, int amount, boolean simulate){
		return null;
	}

	@Override
	public void update(){
		countAverage();
	}

	public abstract void countAverage();

	public abstract int getAverage();

	public abstract String getPowerTranslateKey();

	public void setPeriod(short newPeriod){
		period = newPeriod;
	}
}
