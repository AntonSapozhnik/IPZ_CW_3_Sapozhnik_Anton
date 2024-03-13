package ua.edu.lntu.cw_3.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation
import ua.edu.lntu.cw_3.R
import ua.edu.lntu.cw_3.model.Affirmation


class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.pho1),
            Affirmation(R.string.affirmation2, R.drawable.pho2),
            Affirmation(R.string.affirmation3, R.drawable.pho3),
            Affirmation(R.string.affirmation4, R.drawable.pho4),
            Affirmation(R.string.affirmation5, R.drawable.pho5),
            Affirmation(R.string.affirmation6, R.drawable.pho6),
            Affirmation(R.string.affirmation7, R.drawable.pho7),
            Affirmation(R.string.affirmation8, R.drawable.pho8),
            Affirmation(R.string.affirmation9, R.drawable.pho9),
            Affirmation(R.string.affirmation10, R.drawable.pho10))

    }

}
