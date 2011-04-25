package id.co.bippo.jsfajaxpush;

import java.util.Date;

/** 
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class Article {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private long id = 0;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String subject = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String verb = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String target = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String place = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Date happenedAt = null;

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the '{@link Article#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Article#getId() id}' feature.
	 * @generated
	 */
	public void setId(long newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>subject</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>subject</b></em>' feature
	 * @generated
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Sets the '{@link Article#getSubject() <em>subject</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Article#getSubject() subject}' feature.
	 * @generated
	 */
	public void setSubject(String newSubject) {
		subject = newSubject;
	}

	/**
	 * Returns the value of '<em><b>verb</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>verb</b></em>' feature
	 * @generated
	 */
	public String getVerb() {
		return verb;
	}

	/**
	 * Sets the '{@link Article#getVerb() <em>verb</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Article#getVerb() verb}' feature.
	 * @generated
	 */
	public void setVerb(String newVerb) {
		verb = newVerb;
	}

	/**
	 * Returns the value of '<em><b>target</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>target</b></em>' feature
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * Sets the '{@link Article#getTarget() <em>target</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Article#getTarget() target}' feature.
	 * @generated
	 */
	public void setTarget(String newTarget) {
		target = newTarget;
	}

	/**
	 * Returns the value of '<em><b>place</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>place</b></em>' feature
	 * @generated
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * Sets the '{@link Article#getPlace() <em>place</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Article#getPlace() place}' feature.
	 * @generated
	 */
	public void setPlace(String newPlace) {
		place = newPlace;
	}

	/**
	 * Returns the value of '<em><b>happenedAt</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>happenedAt</b></em>' feature
	 * @generated
	 */
	public Date getHappenedAt() {
		return happenedAt;
	}

	/**
	 * Sets the '{@link Article#getHappenedAt() <em>happenedAt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Article#getHappenedAt() happenedAt}' feature.
	 * @generated
	 */
	public void setHappenedAt(Date newHappenedAt) {
		happenedAt = newHappenedAt;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Article " + " [id: " + getId() + "]" + " [subject: "
				+ getSubject() + "]" + " [verb: " + getVerb() + "]"
				+ " [target: " + getTarget() + "]" + " [place: " + getPlace()
				+ "]" + " [happenedAt: " + getHappenedAt() + "]";
	}
}
