package net.william278.husktowns.events;

import net.william278.husktowns.claim.Position;
import net.william278.husktowns.claim.TownClaim;
import net.william278.husktowns.town.Town;
import net.william278.husktowns.user.BukkitUser;
import net.william278.husktowns.user.OnlineUser;
import org.bukkit.Location;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

public class PlayerEnterTownEvent extends PlayerEvent implements IPlayerEnterTownEvent, Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private boolean isCancelled = false;

    private final TownClaim claim;
    private final Position movedFrom;
    private final Position movedTo;

    public PlayerEnterTownEvent(@NotNull BukkitUser user, @NotNull TownClaim claim,
                                @NotNull Position fromPosition, @NotNull Position toPosition) {
        super(user.getPlayer());
        this.claim = claim;
        this.movedFrom = fromPosition;
        this.movedTo = toPosition;
    }

    @Override
    @NotNull
    public OnlineUser getUser() {
        return BukkitUser.adapt(getPlayer());
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.isCancelled = cancel;
    }

    @Override
    @NotNull
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    @NotNull
    @SuppressWarnings("unused")
    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @Override
    @NotNull
    public TownClaim getEnteredTownClaim() {
        return claim;
    }

    @Override
    @NotNull
    public Position getFromPosition() {
        return movedFrom;
    }

    @Override
    @NotNull
    public Position getToPosition() {
        return movedTo;
    }

    /**
     * Returns the name of the town the player left
     *
     * @return the name of the town the user was in
     * @deprecated use {@link #getEntered()} and {@link Town#getName()} instead
     */
    @NotNull
    @Deprecated(since = "2.0")
    public String getEnteredTown() {
        return getEntered().getName();
    }

    @NotNull
    @SuppressWarnings("unused")
    public Location getFromLocation() {
        return new Location(getPlayer().getWorld(), movedFrom.getX(), movedFrom.getY(), movedFrom.getZ(), movedFrom.getYaw(), movedFrom.getPitch());
    }

    @NotNull
    @SuppressWarnings("unused")
    public Location getToLocation() {
        return new Location(getPlayer().getWorld(), movedTo.getX(), movedTo.getY(), movedTo.getZ(), movedTo.getYaw(), movedTo.getPitch());
    }
}
