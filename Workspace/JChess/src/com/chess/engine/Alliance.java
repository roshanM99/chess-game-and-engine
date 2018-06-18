package com.chess.engine;

import com.chess.engine.player.BlackPlayer;
import com.chess.engine.player.Player;
import com.chess.engine.player.WhitePlayer;

/**
 * @author Roshan Munjal
 */
public enum Alliance {
	WHITE {
		@Override
		public int getDirection() {
			return -1;
		}
		
		@Override
		public int getOppositeDirection() {
			return BLACK.getDirection();
		}

		@Override
		public boolean isBlack() {
			return false;
		}

		@Override
		public boolean isWhite() {
			return true;
		}

		@Override
		public Player choosePlayer(WhitePlayer whitePlayer, BlackPlayer blackPlayer) {
			return whitePlayer;
		}
	},
	BLACK {
		@Override
		public int getDirection() {
			return 1;
		}
		
		@Override
		public int getOppositeDirection() {
			return WHITE.getDirection();
		}

		@Override
		public boolean isBlack() {
			return true;
		}

		@Override
		public boolean isWhite() {
			return false;
		}

		@Override
		public Player choosePlayer(WhitePlayer whitePlayer, BlackPlayer blackPlayer) {
			return blackPlayer;
		}
	};
	
	public abstract int getDirection();
	public abstract int getOppositeDirection();
	public abstract boolean isBlack();
	public abstract boolean isWhite();
	public abstract Player choosePlayer(final WhitePlayer whitePlayer, final BlackPlayer blackPlayer);
}
