package org.agregiosolution.greenpowertrade.domaine;

public class InconsistentContributionException extends BusinessException{
    public InconsistentContributionException() {
        super("La contribution des parcs n'est pas égale au total des quantités d'électricité des blocs.");
    }
}
