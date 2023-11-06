=begin
#Fly Machines API

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.1.0-SNAPSHOT

=end

require 'date'
require 'time'

module FlySDK
  class Volume
    attr_accessor :attached_alloc_id

    attr_accessor :attached_machine_id

    attr_accessor :block_size

    attr_accessor :blocks

    attr_accessor :blocks_avail

    attr_accessor :blocks_free

    attr_accessor :created_at

    attr_accessor :encrypted

    attr_accessor :fstype

    attr_accessor :id

    attr_accessor :name

    attr_accessor :region

    attr_accessor :size_gb

    attr_accessor :snapshot_retention

    attr_accessor :state

    attr_accessor :zone

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'attached_alloc_id' => :'attached_alloc_id',
        :'attached_machine_id' => :'attached_machine_id',
        :'block_size' => :'block_size',
        :'blocks' => :'blocks',
        :'blocks_avail' => :'blocks_avail',
        :'blocks_free' => :'blocks_free',
        :'created_at' => :'created_at',
        :'encrypted' => :'encrypted',
        :'fstype' => :'fstype',
        :'id' => :'id',
        :'name' => :'name',
        :'region' => :'region',
        :'size_gb' => :'size_gb',
        :'snapshot_retention' => :'snapshot_retention',
        :'state' => :'state',
        :'zone' => :'zone'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'attached_alloc_id' => :'String',
        :'attached_machine_id' => :'String',
        :'block_size' => :'Integer',
        :'blocks' => :'Integer',
        :'blocks_avail' => :'Integer',
        :'blocks_free' => :'Integer',
        :'created_at' => :'String',
        :'encrypted' => :'Boolean',
        :'fstype' => :'String',
        :'id' => :'String',
        :'name' => :'String',
        :'region' => :'String',
        :'size_gb' => :'Integer',
        :'snapshot_retention' => :'Integer',
        :'state' => :'String',
        :'zone' => :'String'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `FlySDK::Volume` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `FlySDK::Volume`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'attached_alloc_id')
        self.attached_alloc_id = attributes[:'attached_alloc_id']
      end

      if attributes.key?(:'attached_machine_id')
        self.attached_machine_id = attributes[:'attached_machine_id']
      end

      if attributes.key?(:'block_size')
        self.block_size = attributes[:'block_size']
      end

      if attributes.key?(:'blocks')
        self.blocks = attributes[:'blocks']
      end

      if attributes.key?(:'blocks_avail')
        self.blocks_avail = attributes[:'blocks_avail']
      end

      if attributes.key?(:'blocks_free')
        self.blocks_free = attributes[:'blocks_free']
      end

      if attributes.key?(:'created_at')
        self.created_at = attributes[:'created_at']
      end

      if attributes.key?(:'encrypted')
        self.encrypted = attributes[:'encrypted']
      end

      if attributes.key?(:'fstype')
        self.fstype = attributes[:'fstype']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.key?(:'region')
        self.region = attributes[:'region']
      end

      if attributes.key?(:'size_gb')
        self.size_gb = attributes[:'size_gb']
      end

      if attributes.key?(:'snapshot_retention')
        self.snapshot_retention = attributes[:'snapshot_retention']
      end

      if attributes.key?(:'state')
        self.state = attributes[:'state']
      end

      if attributes.key?(:'zone')
        self.zone = attributes[:'zone']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          attached_alloc_id == o.attached_alloc_id &&
          attached_machine_id == o.attached_machine_id &&
          block_size == o.block_size &&
          blocks == o.blocks &&
          blocks_avail == o.blocks_avail &&
          blocks_free == o.blocks_free &&
          created_at == o.created_at &&
          encrypted == o.encrypted &&
          fstype == o.fstype &&
          id == o.id &&
          name == o.name &&
          region == o.region &&
          size_gb == o.size_gb &&
          snapshot_retention == o.snapshot_retention &&
          state == o.state &&
          zone == o.zone
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [attached_alloc_id, attached_machine_id, block_size, blocks, blocks_avail, blocks_free, created_at, encrypted, fstype, id, name, region, size_gb, snapshot_retention, state, zone].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      transformed_hash = {}
      openapi_types.each_pair do |key, type|
        if attributes.key?(attribute_map[key]) && attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = nil
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[attribute_map[key]].is_a?(Array)
            transformed_hash["#{key}"] = attributes[attribute_map[key]].map { |v| _deserialize($1, v) }
          end
        elsif !attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = _deserialize(type, attributes[attribute_map[key]])
        end
      end
      new(transformed_hash)
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def self._deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = FlySDK.const_get(type)
        klass.respond_to?(:openapi_any_of) || klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
