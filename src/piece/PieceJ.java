package piece;

import javafx.scene.paint.Color;
import piece.Case.EtatCase;

public class PieceJ extends Piece {

	public PieceJ() {
		super();
		this.color = Color.VIOLET;
		Case vide = new Case();
		Case plein = new Case(EtatCase.PLEIN, color);
		Case[][] shape = { { vide.copie(), vide.copie(), vide.copie(), vide.copie() },
				{ vide.copie(), vide.copie(), plein.copie(), vide.copie() },
				{ vide.copie(), vide.copie(), plein.copie(), vide.copie() },
				{ vide.copie(), plein.copie(), plein.copie(), vide.copie() } };
		shapeList.add(shape);
		shape = new Case[][] { { vide.copie(), vide.copie(), vide.copie(), vide.copie() },
				{ vide.copie(), vide.copie(), vide.copie(), vide.copie() },
				{ vide.copie(), plein.copie(), vide.copie(), vide.copie() },
				{ vide.copie(), plein.copie(), plein.copie(), plein.copie() } };
		shapeList.add(shape);
		shape = new Case[][] { { vide.copie(), vide.copie(), vide.copie(), vide.copie() },
				{ vide.copie(), plein.copie(), plein.copie(), vide.copie() },
				{ vide.copie(), plein.copie(), vide.copie(), vide.copie() },
				{ vide.copie(), plein.copie(), vide.copie(), vide.copie() } };
		shapeList.add(shape);
		shape = new Case[][] { { vide.copie(), vide.copie(), vide.copie(), vide.copie() },
				{ vide.copie(), vide.copie(), vide.copie(), vide.copie() },
				{ vide.copie(), plein.copie(), plein.copie(), plein.copie() },
				{ vide.copie(), vide.copie(), vide.copie(), plein.copie() } };
		shapeList.add(shape);
	}

}
